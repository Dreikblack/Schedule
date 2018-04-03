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
    
    insertTrainer(name)  {
       var request = new XMLHttpRequest();
       var jsonObj = {
           name:name
       };
        var jsonStr = JSON.stringify(jsonObj) ;
        request.open('GET','/schedule/InsertTrainer?json='+jsonStr, false);
        request.send();
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        } else
        {
            var res = JSON.parse(request.responseText);
            return res;
        }
    }
    
    updateTrainer(id, name)
    {
       var request = new XMLHttpRequest();
       var jsonObj = {
           id:id,
           name:name
       };
        var jsonStr = JSON.stringify(jsonObj) ;
        request.open('GET','/schedule/UpdateTrainer?json='+jsonStr, false);
        request.send();
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        } else
        {
            var res = JSON.parse(request.responseText);
            return res;
        }
    }
    
    deleteTrainer(id)
    {
        var request = new XMLHttpRequest();

        request.open('GET', '/schedule/DeleteTrainer?id=' + id, false);
        request.send();
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        } else
        {
            var res = JSON.parse(request.responseText);
            return res;
        }
    }
}