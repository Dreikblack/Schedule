class TrainerService
{
    getTrainerAll()
    {
        var request = new XMLHttpRequest();
        
        request.open('GET', '/schedule/GetTrainerAll',false);
        request.send();
        
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        }
        else
        {
           //alert(request.status + ":" + request.statusText);
         //  alert(request.responseText)
            var trainers = JSON.parse(request.responseText);
           return trainers;
        }
    }
    getTrainerById(id)
    {
        var request = new XMLHttpRequest();
        
        request.open("GET", "/schedule/GetTrainerById"+"?id="+id,false);
        request.send();
        
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        }
        else
        {
           var trainer = JSON.parse(request.responseText);
           return trainer;
        }
    }
    
    getLessonByIdTrainer(id)     {
        var request = new XMLHttpRequest();
        request.open('GET', '/schedule/GetTrainerById'+'?id='+id, false);
        request.send();
        
        if (request.status !== 200) 
        {
            alert( request.status + ': ' + request.statusText ); 
            return null;
        } 
        else 
        {
            var trainer = JSON.parse(request.responseText);
            return trainer.lesson;
        }
    }
}