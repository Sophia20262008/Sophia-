// Initialize AOS for scroll animations
AOS.init({
  duration: 1000,
  once: true
});

// Optional: Scroll to top on refresh
window.onbeforeunload = function () {
  window.scrollTo(0, 0);
};
