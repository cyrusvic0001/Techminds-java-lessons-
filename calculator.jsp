<form method="get" action="calculator.jsp">
<input type="number" name="a" />
 <select name =op>
 <option value="+">+</option>
 <option value="-">-</option>
 <option value="*">*</option>
 <option value="/">/</option>
 </select>
 <input type="number" name="b" />
 <button type="submit">Calculate</button>
 </form>


<%
 string op = request.getParameter("op");
 try {
 double a = Double.parseDouble(request.getParameter("a"));
 double b = Double.parseDouble(request.getParameter("b"));
 double result =0;

  switch(op) {
  case "+"; result =a+b; break;
  case "-"; result =a-b; break;
  case "*"; result =a*b; break;
  case "/"; result =a/b; break;
  }
 %>
  <p>result : <%= result %></p>
 <%
  catch (Exception e) {
 %>
  p>Enter vaild numbers!</p>
 <%
 }
 %>
