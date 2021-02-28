$(document).ready(function(){
    const slideValue = document.querySelector("#cailon");
    const slideValue2 = document.querySelector("#cailon2");
    const inputSlider = document.querySelector("#concac");
    inputSlider.oninput = (()=>{
        let value = inputSlider.value;
        slideValue2.textContent = value;
        slideValue2.style.left = (value/2) + "%";
        slideValue2.classList.add("show");
        slideValue.textContent = value;
        slideValue.style.left = (value/2) + "%";
        slideValue.classList.add("show");
    });
    inputSlider.onblur = (()=>{
        slideValue2.classList.remove("show");
        slideValue.classList.remove("show");
    });

    const slideValueNew = document.querySelector("#cailonNew");
    const slideValueNew2 = document.querySelector("#cailonNew2");
    const inputSliderNew = document.querySelector("#concac2");
    inputSliderNew.oninput = (()=>{
        let value = inputSliderNew.value;
        slideValueNew2.textContent = value;
        slideValueNew2.style.left = (value/2) + "%";
        slideValueNew2.classList.add("show");
        slideValueNew.textContent = value;
        slideValueNew.style.left = (value/2) + "%";
        slideValueNew.classList.add("show");
    });

    inputSliderNew.onblur = (()=>{
        slideValueNew2.classList.remove("show");
        slideValueNew.classList.remove("show");
    });
});

function hello() {
    alert("Hello! I am an alert box!!");
}