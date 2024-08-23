function submitExam() {
    const form = document.getElementById('examForm');
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = ''; // Limpiar resultados anteriores
    let score = 0;
    let totalQuestions = 3;

    // Pregunta 1: Radio button
    const question1 = form.question1.value;
    if (question1) {
        if (question1 === "París") {
            score++;
            resultsDiv.innerHTML += "<p class='correct'>Pregunta 1: Correcto</p>";
        } else {
            resultsDiv.innerHTML += "<p class='incorrect'>Pregunta 1: Incorrecto. La respuesta correcta es París.</p>";
        }
    } else {
        resultsDiv.innerHTML += "<p class='incorrect'>Pregunta 1: No respondida.</p>";
    }

    // Pregunta 2: Checkbox
    const correctAnswers2 = ["Rojo", "Azul", "Amarillo"];
    const selectedAnswers2 = [];
    form.querySelectorAll('input[name="question2"]:checked').forEach((checkbox) => {
        selectedAnswers2.push(checkbox.value);
    });

    if (selectedAnswers2.length > 0) {
        if (arraysEqual(correctAnswers2, selectedAnswers2)) {
            score++;
            resultsDiv.innerHTML += "<p class='correct'>Pregunta 2: Correcto</p>";
        } else {
            resultsDiv.innerHTML += `<p class='incorrect'>Pregunta 2: Incorrecto. Las respuestas correctas son Rojo, Azul y Amarillo.</p>`;
        }
    } else {
        resultsDiv.innerHTML += "<p class='incorrect'>Pregunta 2: No respondida.</p>";
    }

    // Pregunta 3: Pregunta abierta
    const question3 = form.question3.value.trim().toLowerCase();
    if (question3) {
        if (question3.includes("evaporación") && question3.includes("condensación") && question3.includes("precipitación")) {
            score++;
            resultsDiv.innerHTML += "<p class='correct'>Pregunta 3: Correcto</p>";
        } else {
            resultsDiv.innerHTML += "<p class='incorrect'>Pregunta 3: Incorrecto. Asegúrate de mencionar la evaporación, condensación y precipitación.</p>";
        }
    } else {
        resultsDiv.innerHTML += "<p class='incorrect'>Pregunta 3: No respondida.</p>";
    }

    resultsDiv.innerHTML += `<p>Tu puntaje es ${score} de ${totalQuestions}</p>`;
    resultsDiv.classList.remove('hidden');
}

function arraysEqual(arr1, arr2) {
    if (arr1.length !== arr2.length) return false;
    arr1.sort();
    arr2.sort();
    return arr1.every((value, index) => value === arr2[index]);
}
