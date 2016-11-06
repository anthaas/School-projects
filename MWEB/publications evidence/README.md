#Used technologies

* [Bootstrap](http://getbootstrap.com/)
* [Smarty](http://www.smarty.net/)
* [Awesomplete](https://leaverou.github.io/awesomplete/)

[Live Demo](https://158.194.128.62/smarty/index.php)

#Installation

- Execute installation script in root folder.
- Bootstrap and Smarty will be downloaded.
- Created dir structure:

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

##MySQL database
- MySql database is required.
- In the file `publications/publications.php` there is a connection setup.
- `create table.sql` will create needed table.
