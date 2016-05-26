<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>..:: JSF Esempio::..</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:outputText value="Inserisci il tuo nome per accedere" />

			<h:commandButton value="Accedi" action="new" />
			<h:commandButton value="Visualizza le tipologie di esame offerte dalla clinica" action="visualizzaTipologie" />

		</h:form>
	</f:view>
</body>
</html>
