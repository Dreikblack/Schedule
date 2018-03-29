class UserService
{
 /*   checkUser(login, password)
    {
        var request = new XMLHttpRequest();
        var body = 'login='+login + '&password='+password;
        request.open('POST', '/autorization',false);
        request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        
        request.send(body);
        
        if (request.status !== 200)
        {
            alert(request.status + ":" + request.statusText);
            return null;
        }
        else
        {
           var checkState = JSON.parse(request.responseText);
           alert(checkState);
        }
    }
    */
    
     getUserAll()
    {
        var request = new XMLHttpRequest();
        
        request.open('GET', '/schedule/GetAllUsers',false);
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
           var users = JSON.parse(request.responseText);
           return users;
        }
    }
}