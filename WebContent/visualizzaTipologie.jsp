<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
   xmlns:f="http://java.sun.com/jsf/core"    
   xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tipologie di esame offerte dalla clinica</title>
<h:outputStylesheet library="css" name="bootstrap.css"  /> 
</head>
<body>
<h:dataTable value="#{tipologieEsame.tipologie}" var="c">
      <h:column><f:facet name="header">Codice Tipologia</f:facet>
         #{c.codicetipologia}
      </h:column>
      <h:column><f:facet name="header">Nome</f:facet>
         #{c.nome}
      </h:column>
      <h:column><f:facet name="header">Descrizione</f:facet>
         #{c.descrizione}
      </h:column>
      <h:column><f:facet name="header">Costo</f:facet>
         #{c.costo}
      </h:column>
      <h:column><f:facet name="header">Prerequisiti</f:facet>
         #{c.prerequisiti}
      </h:column>
      
      
      
      
      
      
   </h:dataTable>



</body>
</html>

<%-- <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
   xmlns:f="http://java.sun.com/jsf/core"    
   xmlns:h="http://java.sun.com/jsf/html">
   <h:head>
      <title>JSF Tutorial!</title>
      <h:outputStylesheet library="css" name="styles.css"  /> 
   </h:head>
   <h2>JDBC Integration Example</h2>
   <h:dataTable value="#{userData.authors}" var="c"
      styleClass="authorTable"
      headerClass="authorTableHeader"
      rowClasses="authorTableOddRow,authorTableEvenRow">
      <h:column><f:facet name="header">Author ID</f:facet>
         #{c.id}
      </h:column>
      <h:column><f:facet name="header">Name</f:facet>
         #{c.name}
      </h:column>
   </h:dataTable>
   </h:body>
</html> --%>