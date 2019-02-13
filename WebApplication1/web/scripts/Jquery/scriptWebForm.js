$.validator.setDefaults({
    submitHandler: function (){
        alert("submitted esen!!");
    }
});

$(document).ready(function(){
    //validate the comment form when it is submitted
    //elemento con id que se llama commentform
    $("#myform").validate({
        rules:{
            name: "required",
            age: {
                required: true,
                minlength: 2
            }
        } ,messages:{
            name: "are you f*cking around? fill the damn text!!",
            age: {
                required: "please fill this",
                minlength: "this is too little!"
            }
        }
        
        });
});

