# Úkoly

<ol>


<li>
<p>Navrhněte generickou třídu <code>NumericList</code>, která bude reprezentovat neprázdný seznam čísel a bude mít následující metody.</p>
<pre><code class="java">/** vraci prvni prvek v seznamu */
T first(); 

/** vraci seznam bez prvniho prvku, pokud seznam obsahuje prave jeden prvek, vraci null */
NumericList&lt;T&gt; next(); 

/** vraci delku seznamu */
int size(); 

/** vraci soucet vsech hodnot v seznamu */
double sum();
</code></pre>

Zvolte vhodné typové omezení a konstruktor.</p></li>




<li>
<p>Napište statickou metodu <code>String formatStr(String format, Object... args)</code>, která vrátí řetězec, kde budou nahrazeny podřetězce <code>%&lt;cislo&gt;</code> hodnotou příslušného argumentu. <code>&lt;cislo&gt;</code> může být libovolné nezáporné číslo.
<pre><code class="java">/** příklad */
formatStr("A: %0; B: %1", 1, "XY"); // ===&gt; "A: 1; B: XY"
</code></pre>
</p></li>

<li>
<p>Napište třídu <code>AnimalFarm</code> evidující informace o zvířatech na statku. Třída bude mít dvě metody: <code>add</code>, která přidá do seznamu zvíře a o něm následující informace: jméno, druh zvířete, pohlaví a metodu <code>list</code>, která vypíše seznam zvířat ve tvaru:
<pre>
Alík je pes a dělá "haf-haf".
Bobík je kačena a dělá "ga-ga".
Chubaka je fena a dělá "haf-haf".
Donald je kačer a dělá "ga-ga".
</pre>

Navrhěte vhodné výčtové typy pro reprezentaci zvířat.<p></li>




</ol>
