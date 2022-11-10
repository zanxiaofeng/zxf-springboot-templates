<#ftl output_format="HTML">
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>HTML test</title>
<#outputformat "JavaScript">
        <script>
            var jsP = "${jsP?js_string}";
            console.log("#########: " + jsP);
            console.log("OutputFormat: ${.output_format}");
        </script>
</#outputformat>
    </head>
    <body>
        <h1>HTML test</h1>
        <p>${htmlP}</p>
        <p>OutputFormat: ${.output_format}</p>
    </body>
</html>