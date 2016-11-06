#Použité technologie

* [Bootstrap](http://getbootstrap.com/)
* [Smarty](http://www.smarty.net/)
* [Awesomplete](https://leaverou.github.io/awesomplete/)

[Live Demo](https://158.194.128.62/smarty/index.php)

#Instalace

Spuštění instalačního skriptu v kořenovém adresáři projektu stáhne potřebné frameworky a vytvoří dodatečnou adresářovou strukturu:

<pre>
/web/www.example.com/
        publications/
			awesomplete.css
			awesomplete.js
			bootstrap/
				css/
				fonts/
				js/
			publications.php
		smarty/
        templates/
            add_publication.tpl
			exported.tpl
			export_form.tpl
			master.tpl
			publications.tpl
        templates_c/
        configs/
        cache/
        index.php
        setup.php
</pre>

##MySQL databáze
- Projekt vyžaduje vytvoření MySql databáze.
- V souboru `publications/oublications.php` je třeba správně upravit připojení do databáze.
- Skript `create table.sql` vytvoří potřebné tabulky.
