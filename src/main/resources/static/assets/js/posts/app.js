// STARTIMI - apo inicializimi i programit
// lidhja e DOM me variablat ne JS

const postApi = new PostApi();

postApi.findAll()
    .then(data => console.log("Loaded successfully!"))
    .catch(error => console.error("Error loading data!"))
    .finally(() => console.log("I am done!"));

console.log("CKA BONE NJERI!");