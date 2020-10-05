
            var events=[];
            const pushBtn=document.querySelector("#btn1");
            const popBtn=document.querySelector("#btn2");
            const displayBtn=document.querySelector("#btn3");
            
            function addEvent(){
                var event = document.getElementById('input1').value;
                console.log(event);
                if(events.length===0){
                    events.push(event);
                    document.getElementById('sucessMessage').innerHTML="Sucessfully entered";
                    document.getElementById('sucessMessage').style.color="green";
                    document.getElementById('sucessMessage').style.textAlign="center";
                    console.log(events)
                }
                else{
                    isPresent=true;
                    console.log("in else part");
                    for(i=0;i<events.length;i++){
                        if(events[i]===event){
                           isPresent=false;
                           console.log("in for loop");
                        }
                    }
                    if(isPresent===true){
                        events.push(event);
                        document.getElementById('sucessMessage').innerHTML="Sucessfully entered";
                        document.getElementById('sucessMessage').style.color="green";
                        document.getElementById('sucessMessage').style.textAlign="center";
                        console.log(events);
                    }
                    else{
                        document.getElementById('sucessMessage').innerHTML="Enter a different Name";
                        document.getElementById('sucessMessage').style.color="red";
                        document.getElementById('sucessMessage').style.textAlign="center";
                    }
                }
            }
           
            function popEvent(){
                events.pop();
                document.getElementById('sucessMessage').innerHTML="Sucessfully entered";
                document.getElementById('sucessMessage').style.color="green";
            }
            
            function display(){
           
            events.sort();
            var result= '<h3>The Events in The Array After Sorting</h3>';
            events.forEach(function(event){
                result+='<li>'+event;
            });
            document.getElementById("resList").innerHTML=result;
            }
            
            pushBtn.addEventListener('click',addEvent);
            popBtn.addEventListener('click',popEvent);
            displayBtn.addEventListener('click',display);
