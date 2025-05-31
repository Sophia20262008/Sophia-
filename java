// Initialize AOS for scroll animations
AOS.init({
  duration: 1000,
  once: true
});

// Optional: Scroll to top on refresh
window.onbeforeunload = function () {
  window.scrollTo(0, 0);
};
// Initialize AOS
document.addEventListener("DOMContentLoaded", () => {
  AOS.init({
    duration: 1000, // Animation duration in milliseconds
    once: true,     // Animation occurs only once
    mirror: true,   // Allow animations when scrolling back
    easing: "ease-in-out", // Animation easing function
  });
});
