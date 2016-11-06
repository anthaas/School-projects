# Úkoly

<ol>


<li>
<p>
S využitím rozhraní
<pre><code class="java">public interface Mapping {
  Object map(Object o);
}
</code></pre>
implementujte metodu <code>List&lt;Object&gt; map(List&lt;Object&gt; list, Mapping m)</code>, která se chová stejně jako funkce <code>map</code>, známá z jazyka Scheme/Lisp.
</p>

<li>
<p>
Stejným způsobem navrhněte metodu <code>List&lt;Object&gt; filter(List&lt;Object&gt; list, Condition c)</code>, která ze seznamu vybere hodnoty splňující danou podmínku. Navrhňete vhodnou třídu/rozhraní <code>Condition</code>. Metodu otestujte výběrem sudých celých čísel ze seznamu. Podmínku vytvořte jako vnitřní třídu, jako anonymní třídu i jako lambda výraz.
</p>
</li>


<li>
<p>
Implementujte statickou metodu <code>String repeatChar1(char c, int n)</code>, která vytvoří řetezec skládající se z <code>n</code> znaků <code
>c</code> s použitím konkatenace řetězců (tj. <code>s += c</code>). Implementujte metodu <code>String repeatChar2(char c, int n)</code>, která se bude chovat identicky jako metoda <code>repeatChar1</code>, ale bude používat <code>StringBuilder</code>. Změřte rychlost obou metod (s využitím <code>System.currentTimeMillis</code>) při vytváření řetězce o velikosti 100000 znaků.
</p>
</li>




</ol>
