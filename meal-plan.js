(function() {
    console.log("Hey");
    window.addEventListener("load", init);
    
    function init() {
        document.getElementById("open-sidenav").addEventListener("click", expand);
        document.getElementById("close-button").addEventListener("click", collapse);
    }
    
    console.log("hey2");

// Animated side menu navigation
function expand() {
    document.getElementById("my-sidenav").style.width = "25%";
    console.log("Yay");
}

function collapse() {
    document.getElementById("my-sidenav").style.width = "0%";
}
/*
// checkout button on home page
function checkout() {
  document.getElementById("checkoutButton").addEventListener("click", checkoutClick);
}

function checkoutClick() {
  // TODO: Until Pao defines checkout page id's
  // hide all the other stuff
  document.getElementById("???").style.display = "none";
  // make visible the checkout divs
  document.getElementById("???").style.display = "block";
}*/
})();
