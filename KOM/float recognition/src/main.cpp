#include <iostream>
#include <map>
#include <fstream>
#include <string>

#include "transition.h"

using namespace std;

struct Key {
	int currentState;
	char character;

	Key(int s, char c){
		currentState = s;
		character = c;
	}
};

bool operator < (const Key &k1, const Key &k2){
	return k1.currentState == k2.currentState ? k1.character < k2.character : k1.currentState < k2.currentState;
}


void automata(const char* c, multimap<Key, int> map){
	int current = 1;
	Key currentKey = Key(current, c[0]);
	for (int i = 0; c[i]; i++) {
		current = map.find(currentKey)->second;
		currentKey = Key(current, c[i+1]);
	}
	if (current > 100 && current < 200){
		cerr << "float" << endl;
	}
	else{
		cerr << "not a float" << endl;
	}
}

static void show_usage(void)
{
	cerr << "Options:\n"
		<< "\t-h,--help\tShow this help message\n"
		<< "\t-v\t\tShow version\n"
		<< "\t-f inputfile\tPath to file with floats to test\n"
		<< endl;
}


int main( int argc, char *argv[] )
{
	/* handling input arguments */
	if (argc < 2) {
		show_usage();
		return 0;
	}
	string argument = argv[1];
	const char *inputfile = "";
	if (argument.compare("-v") == 0) {
		cout << "version 1.2" << endl;
		return 0;
	} else if ((argument.compare("-h") == 0) || (argument.compare("--help") == 0)) {
		show_usage();
		return 0;
	} else if (argument.compare("-f") == 0) {
		if (argc > 2) {
			inputfile = argv[2];
		} else {
			cerr << "missing file path" << endl;
			return -1;
		}
	} else {
		show_usage();
		return 0;
	}

	multimap<Key, int> a;
	for (unsigned int i = 0; i < sizeof(floatNum)/12; i++){
		a.insert(make_pair(Key(floatNum[i].currentState, floatNum[i].character), floatNum[i].nextState));
	}

	ifstream file(inputfile);
	string in;
	while (getline(file, in))
	{
		automata(in.c_str(), a);
	}

	return 0;
}
