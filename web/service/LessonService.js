class LessonService
{
    insertLesson(idGroup, day, timeStart, timeEnd, idTrainer)
    {
        var request = new XMLHttpRequest();
        //
       var jsonObj = {
           idGroup:idGroup,
           day:getIdDay(day),
           timeStart:timeStart,
           timeEnd:timeEnd,
           idTrainer:idTrainer
       };
       
        var jsonStr = JSON.stringify(jsonObj) ;
        request.open('GET','/schedule/InsertLesson?json='+jsonStr, false);
        request.send();
        if (request.status !== 200) //если получена ошибка
        {
            alert(request.status + ":" + request.statusText);
            return null;
        } else
        {
            var res = JSON.parse(request.responseText); //принимаем и парсим ответ
            return res;
        }
    }

    updateLesson(id, idGroup, day, timeStart, timeEnd, idTrainer)
    {
        var request = new XMLHttpRequest();

       var jsonObj = {
           id: id,
           idGroup:idGroup,
           day:getIdDay(day),
           timeStart:timeStart,
           timeEnd:timeEnd,
           idTrainer:idTrainer
       };
         var jsonStr = JSON.stringify(jsonObj) ;
        request.open('GET','/schedule/UpdateLesson?json='+jsonStr, false);
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

    deleteLesson(id)
    {
        var request = new XMLHttpRequest();

        request.open('GET', '/schedule/DeleteLesson?id=' + id, false);
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

function getIdDay(Day)
{
    var Days = ["Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"];
    for (var i = 0; i < Days.length; i++)
    {
        if (Day === Days[i])
            return i;
    }
    return 0;
}
