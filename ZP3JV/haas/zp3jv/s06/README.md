# Úkoly

<ol>


<li>
<p>Vytvořte množinu (<code>Set</code>) bodů (použijte třídu <code>Point</code>) a přesvědčte se, zda-li obsahuje duplicity. (Body zvolte tak, aby minimálně dva měly stejné souřadnice). Rozšiřte třídu <code>Point</code> z minulých cvičení tak, aby vhodně překryla metody <code>Object.equals</code> a <code>Object.hashCode</code>. Znovu Vytvořte stejnou množinu bodů a přesvědčte se, že neobsahuje duplicity.
</p></li>


<li>
<p>Implementujte statickou metodu <code>Map&lt;String, Integer&gt; freq(String s)</code>, která vrací četnost slov v daném textu, mezery, čísla a interpunkci ignorujte, tj. chápejte je jako oddělovače slov.
</p></li>


<li>
<p>Implementujte statickou metodu <code>Map&lt;String, Integer&gt; freqIgnoreCase(String s)</code>, která se chová stejně jako metoda <code>freq</code>, ale nerozlišuje velká a malá písmena.
</p></li>

<li>
<p>Implementuje jednoduchou <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation">RPN kalkulačku</a>. Implementujte ji jako metodu <code>double rpnCalc(String expr)</code>, kde jako argument bude předaný výraz v postfixové notaci (např. <code>"1 2 3 + +"</code> nebo <code>"1 32 + 42 * 5 + 66 -"</code>) a na výstupu bude hodnota výrazu. Kalkulačka by měla fungovat následovně. Výraz je rozložen na jednotlivé atomy a potom je procházen zleva doprava. Pokud je nejlevější prvek číslo, je jeho hodnota uložena na zásobník, je-li to operátor, jsou odebrány ze zásobníku dvě hodnoty a je provedena příslušná operace. Výsledná hodnota je uložena na zásobník. Pro jednoduchost uvažujme pouze celá čísla a binární operace +, -, *, /.
</p></li>


<li>
<p>Rozšiřte předchozí úkol tak, aby metoda  <code>double rpnCalc(String expr, Map &lt;String, Integer&gt; variables)</code> měla ještě jeden argument představující vazby proměnných. Pokud bude nalezen atom představující proměnnou, bude příslušná hodnota uložena na zásobník. Např. "1 foo +" přečte hodnotu "foo" z argumentu <code class="prettyprint lang-java">variables</code>.</p>
</li>



</ol>
