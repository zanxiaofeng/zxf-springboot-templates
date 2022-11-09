<#ftl output_format="HTML">
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>HTML test</title>
        <script>
            var jsP = "${jsP?js_string}";
            console.log("#########" + jsP);
        </script>
    </head>
    <body>
        <h1>HTML test</h1>
        <p>${htmlP}</p>
    </body>
</html>