// STARTIMI - apo inicializimi i programit
// lidhja e DOM me variablat ne JS

// const postApi = new PostApi();
//
// postApi.findById(3)
//     .then(data => console.log("Loaded successfully!"))
//     .catch(error => console.error("Error loading data!"))
//     .finally(() => console.log("I am done!"));
//
// console.log("CKA BONE NJERI!");

class PostApp {
    constructor() {
        this.postApi = new PostApi();
        this.posts = [];
        this.postsTBody = document.getElementById("posts");
        this.loaderDiv = document.getElementById("loader");
        this.mainTable = document.querySelector("div.table-responsive");
    }

    async init() {
        this.mainTable.style = {display: "none"};
        this.loaderDiv.style.display = "block";

        this.posts = await this.postApi.findAll();
        this.displayPosts();

        this.mainTable.style = {display: "block"}
        this.loaderDiv.style.display = "none";
        // setTimeout(() => {
        //     this.loaderDiv.style = "display:none";
        //     this.mainTable.style = "display:block";
        // }, 2000)
    }

    displayPosts() {
        this.postsTBody.innerHTML = '';

        this.posts.forEach(post => {
            this.postsTBody.innerHTML += `
                <tr>
                    <td>${post.id}</td>
                    <td>${post.userId}</td>
                    <td>${post.content}</td>
                    <td>${post.createdAt}</td>
                    <td>
                        <button class="btn btn-danger" type="button">DELETE</button>
                    </td>
                </tr>
            `;
        });
    }
}

new PostApp().init()
    .then(() => console.log("Application initialized successfully!"))
    .catch(error => console.error("Error initializing application!"))
















