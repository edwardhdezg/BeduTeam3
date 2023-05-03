document.getElementById("formulario").addEventListener("submit", function() {
        setTimeout(() => {
          document.getElementById("name").value = "";
                  document.getElementById("tel").value = "";
        }, "2000");

});