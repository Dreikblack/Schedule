class UserController
{
    autorization(login, password)
    {
        var userService = new UserService();
        var users = userService.getUserAll();
        
        for(var i=0; i<users.length;i++)
        {
            if (login === users[i].login && password === users[i].password)
            {
              //  window.location.replace("admin.html"); 
             //   $(location).attr('href', 'admin.html');
             window.location.href = 'admin.html';
                return;
            }
        }
        alert("Введен не верный логин или пароль");
    }
    
    
    
    
    
}