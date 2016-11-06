#!/bin/bash
wget https://github.com/twbs/bootstrap/releases/download/v3.3.7/bootstrap-3.3.7-dist.zip
unzip bootstrap-3.3.7-dist.zip -d publications
mv publications/bootstrap-3.3.7-dist/ publications/bootstrap
rm bootstrap-3.3.7-dist.zip

wget https://github.com/smarty-php/smarty/archive/v3.1.30.zip
unzip v3.1.30.zip
mv smarty-3.1.30/ smarty
rm v3.1.30.zip

mkdir templates_c
mkdir configs
mkdir cache

chmod 777 templates_c/ cache/
