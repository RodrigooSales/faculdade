// constantes declaradas para o botão input e a area da lista de tasks
const taskInput = document.querySelector("#newtask input");
const taskSection = document.querySelector('.tasks');

if (taskInput) {
    taskInput.addEventListener("keyup", (e) => {
        if (e.key == "Enter") { 
        createTask(); 
        }
    });
}

document.querySelector('#push').onclick = function () {
    createTask();
}

function createTask() {
    if (taskInput.value.lenght == 0) {
        alert("A tarefa esta em branco. Digite a tarefa e tente novamente");
    }
    else {
        taskSection.innerHTML +=
        `<div class="task">
        <label id="taskname">
        <input onclick="updateTask(this)" type="checkbox" id="check-task">
        <p>${document.querySelector('#newtask input').value}</p>
        </label>
        <div class="delete">
        <i class="uil uil-trash"></i><div></div>`;

        var current_task = document.querySelectorAll(".delete");
        for (var i = 0; i < current_task.length; i++) {
            current_task[i].onclick = function () {
                this.parentNode.remove();
            }
        }
        taskSection.offsetHeight >= 300
            ? taskSection.classList.add("overflow")
            : taskSection.classList.remove("overflow")
    }
}

function updateTask(task) {
    let taskItem = task.parentElement.lastElementChild;
    if (task.checked) {
        taskItem.classList.add("checked");
    }
    else {
        taskItem.classList.remove("checked");
    }
}