(function() {
    window.addEventListener("load", init);
    
    function init() {
        document.getElementById("open-sidenav").addEventListener("click", expand);
        document.getElementById("close-button").addEventListener("click", collapse);
        document.getElementById("drop").addEventListener("click", dropdown);
        document.getElementById("checkout").addEventListener("click", checkout);
    }

// Animated side menu navigation
function expand() {
    document.getElementById("my-sidenav").style.width = "25%";
}

function collapse() {
    document.getElementById("my-sidenav").style.width = "0%";
}

/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function dropdown() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}

// checkout button on home page
function checkout() {
    document.getElementById("menu-id").style.display = "none";
    document.getElementById("checkout-id").style.display = "block";
    readJSON();
}

// read/parse JSON
function readJSON() {
    var obj = JSON.parse(hamshake);
    console.log(obj);
}
})();
