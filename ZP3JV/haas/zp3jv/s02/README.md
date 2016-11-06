# Úkoly

1. Implementujte třídu `Point` představující bod v rovině určený dvěma souřadnicemi. V tříde `Point` implementujte metodu `double distance(Point p)` vracející vzdálenost od daného bodu.

2. Implentujte třídu `Line` představující úsečku. Implementujte metody: `double getLength()` a `double distance(Point p)`. Vzdálenost bodu od úsečky berte v tomto případě jako nejmenší vzdálenost mezi bodem a všemi body ležícími na úsečce.

3. Implementujte třídu `Rectangle` představující obdelník, který má strany vodorovné s osami X a Y. Třída by měla mít dva konstruktory, jeden vytvářející obdelník pomocí dvou bodů, další vytvářející obdelník na základě bodu, výšky a šířky. Implementujte metodu `double getArea()` vracející obsah daného obrazce. Implementujte metodu `double distance(Point p)` vracející vzdálenost od daného bodu. Vzdálenost bodu od obdelníku berte v tomto případě jako nejmenší vzdálenost mezi bodem a všemi body ležícími na stranách obdelníku.

4. Implementujte třídu `Square` představující čtverec. Třída by měla mít konstruktor vytvářející objekt na zákládě souřadnice a délky strany. Implementujte metodu `double getArea()`. Implementujte metodu `double distance(Point p)` vracející vzdálenost od daného bodu.

5. Implementujte třídu `Circle` představující kružnici. Třída by měla mít konstruktor vytvářející objekt na zákládě souřadnice a poloměru. Implementujte metodu `double getArea()`. Implementujte metodu `double distance(Point p)` vracející vzdálenost od daného bodu. Vzdálenost bodu od kružnice berte v tomto případě jako nejmenší vzdálenost mezi bodem a všemi body ležícími na kružnici. Vzdálenost nemůže mít zápornou hodnotu!

6. Třídy z předchozích příkladů upravte tak, aby se díky dědičnosti omezila redundance kódu. Pokud to má opodstatnění, použijte rozhraní.
