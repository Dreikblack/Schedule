class LessonController 
{
    
     insertLesson(group,day,timeStart,timeEnd,trainer)    
     {
       document.getElementById("time_tip").innerHTML="";
       if(!timeStart || !timeEnd) {
           document.getElementById("time_tip").innerHTML="Укажите время";
           return false;
       }
       var groupService = new GroupService();
       var groups = groupService.getGroupAll();
       var idGroup = 0;
       for(var i=0; i<groups.length;i++)
        {
            if (groups[i].name===group)
            {
                idGroup = groups[i].id;
            }
        }
       var trainerService = new TrainerService();
       var trainers = trainerService.getTrainerAll();
       var idTrainer = 0;
       for(var i=0; i<trainers.length;i++)
        {
            if (trainers[i].name===trainer)
            {
                idTrainer = trainers[i].id;
            }
        }
        var lessonService = new LessonService();
        var newTimeStart = timeStart+":00";
        var newTimeEnd = timeEnd+":00";
        lessonService.insertLesson(idGroup,day,newTimeStart,newTimeEnd,idTrainer);
        return true;
    }
    
    updateLesson(id, group,day,timeStart,timeEnd,trainer)     {
       document.getElementById("time_tip").innerHTML="";
       if(!timeStart || !timeEnd) {
           document.getElementById("time_tip").innerHTML="Укажите время";
           return false;
       }
       var groupService = new GroupService();
       var groups = groupService.getGroupAll();
       var idGroup = 0;
       for(var i=0; i<groups.length;i++)
        {
            if (groups[i].name===group)
            {
                idGroup = groups[i].id;
            }
        }
        var trainerService = new TrainerService();
       var trainers = trainerService.getTrainerAll();
       var idTrainer = 0;
       for(var i=0; i<trainers.length;i++)
        {
            if (trainers[i].name===trainer)
            {
                idTrainer = trainers[i].id;
            }
        }
        var newTimeStart = timeStart+":00";
        var newTimeEnd = timeEnd+":00";
        var lessonService = new LessonService();
        lessonService.updateLesson(id,idGroup,day,newTimeStart,newTimeEnd,idTrainer);
        return true;
    }
    
    deleteLesson(id)
    {
        
        var lessonService = new LessonService();
        lessonService.deleteLesson(id);
        window.location.href = 'admin.html';
    }
}


