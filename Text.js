let home_score = 0;
let guest_score = 0;

let homeEl = document.getElementById("home_score_value");
let guestEl = document.getElementById("guest_score_value");

function change_color(){
    if( home_score == 0 && guest_score==0){
        guestEl.style.color = "#F94F6D";
        homeEl.style.color = "#F94F6D";
    }
    else if(home_score > guest_score){
        homeEl.style.color = "green";
        guestEl.style.color = "red";
    }
    else if(guest_score > home_score){
        guestEl.style.color = "green";
        homeEl.style.color = "red";
    }
    else{
        guestEl.style.color = "blue";
        homeEl.style.color = "blue";
    }
}

function plus_one(x){
    if(x==1){
        home_score++;
        homeEl.innerText = home_score;
        
    }
    else{
        guest_score++;
        guestEl.innerText = guest_score;
    }
    change_color();
}

function plus_two(x){
    if(x==1){
        home_score += 2;
        homeEl.innerText = home_score;
    }
    else{
        guest_score += 2;
        guestEl.innerText = guest_score;
    }
    change_color();
}

function plus_three(x){
    if(x==1){
        home_score += 3;
        homeEl.innerText = home_score;
    }
    else{
        guest_score += 3;
        guestEl.innerText = guest_score;
    }
    change_color();
}

function start_again(){
    home_score = 0;
    guest_score = 0;
    homeEl.innerText = home_score;
    guestEl.innerText = guest_score;
    change_color();
}