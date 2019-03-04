$(document).ready(function(){
    $("#myform").validate({
        rules: {
         name: "required",
         lastname:{
             required:true
         },
         age: {
             required: true,
             min: 18
         },
         charge: {
             required: true
         },
         salary: {
             required: true,
             min: 200,
             max: 3000
         }
        }    
    });
});

