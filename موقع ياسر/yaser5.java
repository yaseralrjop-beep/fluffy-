function scrollToSection(id) {
    function sendMessage(event) {
  event.preventDefault(); // يمنع إعادة تحميل الصفحة

  document.getElementById("msg").innerText = "✅ تم إرسال رسالتك بنجاح!";
}
  document.getElementById(id).scrollIntoView({
    behavior: "smooth"
  });
}

// Quiz logic
function checkQuiz(level) {
  let result = document.getElementById("result");

  if (level === 1) {
    result.innerText = "👍 استخدامك ممتاز!";
    result.style.color = "lightgreen";
  } else if (level === 2) {
    result.innerText = "⚠️ انتبه، حاول تقلل شوي";
    result.style.color = "orange";
  } else {
    result.innerText = "🚨 خطر! أنت مدمن تقريبًا";
    result.style.color = "red";
  }
}