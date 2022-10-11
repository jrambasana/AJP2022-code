<html>
<head>
<title>Using EL Operators</title>
</head>
<body>
<h2>Using EL Operators</h2>
<h3>Arithmetic Expressions</h3>
<b>You Score in IELTS is ${1 + 2 * 4 - 6 / 2}.</b><br/>
<b>Today temperature of Delhi is ${-4 - 8} degree celsius.</b><br/>
<b>Is 3/4 equals to 0.75 ? ${(3/4 == 0.75)? "Yes" : "No"}</b><br/>
<b>Mathematical Constant PI has value ${22/7} </b><br/>
<b>GDP of India is ${20 div 2}.</b><br/>
<b>I have ${2003 mod 8} mobiles.</b><br/>
<b>I have ${2003 % 8} mobiles.</b><br/>
<h3>Logical Operators </h3>
<b>This Logical and EL expression \${(1&lt;2) && (4&lt;3)} is
${(1<2) && (4<3)}</b><br/>
<b>This Logical or EL expression \${(1&lt;2) || (4&lt;3)} is
${(1<2) || (4<3)}</b><br/>
<b>This Logical not EL expression \${!(1&lt;2)} is ${!(1<2)}
</b><br/>
<h3>Comparison Operators </h3>
<b>Is 4 > 3 ? ${4 > 3}</b><br/>
<b>Is "a" > "b"? ${"a" > "b"}</b><br/>
<b>Is 4 >= 3 ${4 >= 3}</b><br/>
<b>Is 4 <= 3 ${4 < 3}</b><br/>
<b>Is 4 == 4? ${4 == 4}</b><br/>
<h3>empty Operator</h3>
<b>empty "" ${empty ""}</b><br/>
<b>empty "string" ${empty "string"}</b><br/>
<b>empty null ${empty null}</b>
</body>
</html>