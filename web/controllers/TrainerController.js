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
}