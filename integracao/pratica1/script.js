function betFunc() {
  fetch('https://jsonplaceholder.typicode.com/users')
    .then(response => response.json())
    .then(data => {
      const table = document.createElement('table');
      const thead = document.createElement('thead');
      const tbody = document.createElement('tbody');
      const headers = Object.keys(data[0]);

      const tr = document.createElement('tr');
      headers.forEach(header => {
        const th = document.createElement('th');
        if (header === 'name' || header === 'email') {
          th.textContent = header;
          tr.appendChild(th);
        }
      });

      thead.appendChild(tr);
      table.appendChild(thead);

      data.forEach(user => {

        const tr = document.createElement('tr');
        const tdName = document.createElement('td');
        const tdEmail = document.createElement('td');
        tdName.textContent = user.name;
        tdEmail.textContent = user.email;
        tr.appendChild(tdName);
        tr.appendChild(tdEmail);
        tbody.appendChild(tr);
      });
      table.appendChild(tbody);

      // console.log(table);
      document.body.appendChild(table);
    })
    .catch(error => console.log(error));
}

betFunc();