function abrirMenu(menuId) {
    const menu = document.getElementById(menuId);
    const card = document.getElementById(`card${menuId}`);
    
    // Fechar outros menus e reverter as condições iniciais
    const allMenus = document.querySelectorAll(".floating-menu");
    allMenus.forEach(otherMenu => {
      if (otherMenu.id !== menuId) {
        otherMenu.style.display = "none";
        const otherCard = document.getElementById(`card${otherMenu.id}`);
        otherCard.style.backgroundColor = "#909090";
        otherCard.style.transform = "scale(1)";
        otherCard.style.boxShadow = "none";
        otherCard.style.filter = "none";
      }
    });
    
    if (menu.style.display === "block") {
      menu.style.display = "none";
      card.style.backgroundColor = "#909090";
      card.style.transform = "scale(1)";
      card.style.boxShadow = "none";
      card.style.filter = "none";
    } else {
      menu.style.display = "block";
      card.style.backgroundColor = "#F58E07";
      card.style.transform = "scale(1.05)";
      card.style.boxShadow = "0 0 15px rgba(255, 255, 255, 0.3)";
      card.style.filter = "brightness(1.03)";
    }
  }
  
  document.addEventListener("DOMContentLoaded", function() {
    const exitIcons = document.querySelectorAll(".exit-icon");
    exitIcons.forEach((icon) => {
      icon.addEventListener("click", () => {
        const menu = icon.closest(".floating-menu");
        const card = document.getElementById(`card${menu.id}`);
        menu.style.display = "none";
        card.style.backgroundColor = "#909090";
        card.style.transform = "scale(1)";
        card.style.boxShadow = "none";
        card.style.filter = "none";
      });
    });
  });
  
  