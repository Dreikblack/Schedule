class TrainerController
{
     getTrainerAll()
    {
       var trainerService = new TrainerService();
       return trainerService.getTrainerAll();
    }
    
     getTrainerAllViewSelect() 
    {    
        
        var trainers = this.getTrainerAll();
        var groupsView=document.getElementById("trainers");
        
        var result="<select id='trainer'>";
        for(var i=0; i<trainers.length;i++)
        {
            result+= "<option>"+trainers[i].name+"</option>";
        }
        result+="</select>";
        groupsView.innerHTML = result;
    }
    
    insertTrainerButton() {
      var groupsView=document.getElementById("groups");
      var addTr="<div class='row'><div onclick='trainerClick()' class='btn btn-default col-md-12'>Тренеры</div></div>";
      groupsView.innerHTML += addTr;
    }
    
    getTrainerList()    {
        var trainer = this.getTrainerAll();
        var trainerView=document.getElementById("trainer");
        var result="";
        for(var i=0; i<trainer.length;i++)
        {          
             result+= "<div class='row'>\n\
            <div onclick='tarinerButtonClick("+ trainer[i].id+")' class='btn btn-default col-md-4'>"
                    +trainer[i].name+"</div>\n\
<div onclick='editTrainerClick("+ trainer[i].id+")' class='btn btn-default col-md-2'>Редактировать</div>\n\
<div onclick='deleteTrainerClick("+ trainer[i].id+")' class='btn btn-default col-md-2'>Удалить</div></div>";
        }
        trainerView.innerHTML = result + "<div class='row'><div onclick='addTrainerClick()' class='btn btn-default col-md-4'>Добавить нового тренера</div></div";
    }
    
    checkTrainer(name)
    {
        var complete=true;
        var name_bl=document.getElementById("name_block");
        var name_ti=document.getElementById("name_tip");
        name_bl.classList.remove('has-error');
        name_ti.innerHTML="";
        if(!name) {
            complete=false;
            name_bl.classList.add('has-error');
            name_ti.innerHTML="Поле не заполнено";
        }
        var trainer = this.getTrainerAll();
        for(var i=0; i<trainer.length;i++) {
            if(trainer[i].name===name) {
                complete=false;
                name_bl.classList.add('has-error');
                name_ti.innerHTML="Данный тренер уже есть в списке";
                break;
            }
        }
        return complete;
    }
    
    insertTrainer(name)
    {
        var complete=this.checkTrainer(name);
        if(complete) {
            var trainerService = new TrainerService();
            trainerService.insertTrainer(name);
        }
        return complete;
    }
    
    updateTrainer(id, name)
    {
        var complete=this.checkTrainer(name);
        if(complete) {
            var trainerService = new TrainerService();
            trainerService.updateTrainer(id, name);
        }
        return complete;
    }
    
    deleteTrainer(id)
    {
        var trainerService = new TrainerService();
        trainerService.deleteTrainer(id);
        window.location.href = 'trainers.html';
    }
}