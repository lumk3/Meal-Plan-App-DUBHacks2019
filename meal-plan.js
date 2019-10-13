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
    populate(obj);
}

function populate(obj) {
    document.getElementById("meal-one").innerText = obj[0].Cart.Order1.Meal.name;
    document.getElementById("cost-one").innerHTML = "$" + obj[0].Cart.Order1.Meal.price;
    document.getElementById("quantity-one").innerText = "Quantity: " + obj[0].Cart.Order1.quantity;
    document.getElementById("time-one").innerText = "Pickup Time: " + obj[0].Cart.Order1.time;
    document.getElementById("meal-two").innerText = obj[0].Cart.Order2.Meal2.name;
    console.log(obj[0].Cart.Order2.Meal2.name);
    document.getElementById("cost-two").innerText = "$" + obj[0].Cart.Order2.Meal2.price;
    document.getElementById("quantity-two").innerText = "Quantity: " + obj[0].Cart.Order2.quantity;
    document.getElementById("time-two").innerText = "Pickup Time: " + obj[0].Cart.Order2.time;
}
})();
