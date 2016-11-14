# Úkoly

<ol>


<li>
<p>S pomocí Stream API implementujte statické metody <code>int[] odd(int[] arg)</code> a <code>List&lt;Integer&gt; oddNumbers(List&lt;Integer&gt; arg)</code> vracející pole/seznam čísel, kde budou pouze lichá čísla z argumentu <code>arg</code>.</p>
</li>

<li>
<p>Navhrněte jednoduchou elektronickou kuchařku. Ta se bude skládat z následujících tříd:<p>
<ul>
<li><code>Ingredient</code> - obsahující následující informace o surovině: název suroviny, měrná jednotka, jednotková cena</li>
<li><code>Recipe</code> - obsahující seznam a množství surovin nutných pro přípravu pokrmu.
</ul>

<p>Třída by měla obsahovat následující metody:</p>
<p>
<ul>
<li><code>.toString()</code> - která vrací seznam surovin a jejich množství jako řetězec</li>
<li><code>.getPrice()</code> - která vrací cenu jídla</li>
<li><code>.isCookable(List&lt;Ingredient&gt; availableIngredients)</code> - která vrací <code>true</code>, pokud seznam obsahuje všechny potřebné ingredience pro uvaření pokrmu</li>
<li><code>.getIngredientsByPrice()</code> - která vrací názvy surovin seřazené podle jejich ceny</li>
<li><code>.getTheMostExpensiveIngredient()</code> - která vrací nejnákladnější položku v receptu</li>
</ul>
</p>
</li>

</ol>

Pro implementaci výše zmíněných metod použijte Stream API
