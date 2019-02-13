 $(document).ready(function(){
                $("#button").click(function (){
                var num1 = $("#num1").val();
                    num1 = parseInt(num1);
                var num2 = $("#num2").val();
                    num2 = parseInt(num2);
                var result = num1 + num2;
                $("#result").val(result);
               }); 
            });

