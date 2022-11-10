<#ftl output_format="XML">
<?xml version="1.0" encoding="UTF-8"?>
<note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <format>OutputFormat: ${.output_format}</format>
  <body>${xmlP}</body>
  <json>
  <![CDATA[
  <#outputformat "JSON">
  {
      "output-format": "${.output_format}"
      "jsonP": "${jsonP?json_string}"
  }
  </#outputformat>
  ]]>
  </json>
</note>