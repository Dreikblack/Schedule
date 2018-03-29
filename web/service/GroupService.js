class GroupService
{
    getGroupAll()
    {
        var request = new XMLHttpRequest();
        
        request.open('GET', '/schedule/GetGroupAll',false);
        request.send();
        
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        }
        else
        {
           var groups = JSON.parse(request.responseText);
           return groups;
        }
    }
    getGroupById(id)
    {
        var request = new XMLHttpRequest();
        
        request.open("GET", "/schedule/GetGroupById"+"?id="+id,false);
        request.send();
        
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        }
        else
        {
           var group = JSON.parse(request.responseText);
           return group;
        }
    }
    
    getLessonByIdGroup(id)     {
        var request = new XMLHttpRequest();
        request.open('GET', '/schedule/GetGroupById'+'?id='+id, false);
        request.send();
        
        if (request.status !== 200) 
        {
            alert( request.status + ': ' + request.statusText ); 
            return null;
        } 
        else 
        {
            var group = JSON.parse(request.responseText);
            return group.lesson;
        }
    }
}