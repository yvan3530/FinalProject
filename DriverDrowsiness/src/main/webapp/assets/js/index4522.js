const cookieCheck = () => {
    const getCookie = (name) => {
        let value = "; " + document.cookie;
        let parts = value.split("; " + name + "=");
        if (parts.length == 2) return parts.pop().split(";").shift();
    };
    const currentCookie = getCookie('showpolicy');
    if(currentCookie !== 'hidden'){
        let cookiesBlock = $('.wrapper-cookies');

        cookiesBlock.addClass('active');

        cookiesBlock.find('.cookies-button a').on('click', () => {
            cookiesBlock.removeClass('active');
            document.cookie = 'showpolicy=hidden; expires=Fri, 19 Jun 2040 20:47:11 UTC; path=/'
        });
    }
};
const autodetectSealine = () => {
    const containerNumberInput = $('.filter-tracking input');
    const containerNumberSelect = $('.filter-tracking select');
    let containerNumber;
    let sealineNumber;
    const sealinesList = containerNumberSelect[0].options;

    containerNumberInput.on('change input copy paste cut', function () {
        containerNumber = $(this).val().toString().toUpperCase();

        if (typeof containerNumber === 'string' && containerNumber.length >= 3) {
            let prefix = containerNumber.trim().replace(/[0-9]/g, '').toUpperCase();
            let founded = false;

            for (let sealine in sealinesList) {
                const currentSealine = sealinesList[sealine];
                if( typeof currentSealine.text === 'string' && currentSealine.text.includes(prefix)){
                    sealineNumber =  currentSealine.value
                    founded = true;
                }
            }

            if(founded === true){
                containerNumberSelect.val(sealineNumber);
                containerNumberSelect.trigger('change');
            }else{
                containerNumberSelect.val(0);
                containerNumberSelect.trigger('change');
            }

        } else {
            containerNumberSelect.val(0);
            containerNumberSelect.trigger('change');
        }
    });
};

$(document).ready(function(){
    cookieCheck();
    autodetectSealine();
});


function ChangeActiveSwiper(target) {
    new Swiper(target, {
        direction: 'vertical',
        // reverseDirection: false,
        spaceBetween: 4,
        // noSwiping: true,
        allowTouchMove: false,
        loop: true,
        // parallax: false,
        slidesPerView: 5,
        speed: 2000,
        autoplay: {
            // delay: 400,
            // disableOnInteraction: false,
        },
    });
}

document.addEventListener('DOMContentLoaded', () => {

    var swiperContainer = document.querySelectorAll('.swiper-container');
    var rollers = document.querySelectorAll('.rollers .swiper-container');

    ChangeActiveSwiper(rollers[0]);
    ChangeActiveSwiper(rollers[1]);
    ChangeActiveSwiper(rollers[2]);

    new Swiper('.whySearates-container', {
        spaceBetween: 15,
        slidesPerView: 2,
        speed: 1500,
        autoplay: {
            delay: 5000,
            disableOnInteraction: false,
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
    });


    var productSwiper;

    function activeSlider(width) {
        if (width.matches) {
            if (productSwiper !== undefined) productSwiper.destroy(true, true);
        } else {
            productSwiper = new Swiper('.product-container', {
                spaceBetween: 17,
                freeMode: true,
                speed: 1500,
                parallax: true,
                slidesPerView: 'auto',
                autoplay: {
                    delay: 5000,
                    disableOnInteraction: false,
                },
            });
        }
    }

    var windowWidth = window.matchMedia('(max-width: 520px)');
    activeSlider(windowWidth);
    windowWidth.addListener(activeSlider);

});