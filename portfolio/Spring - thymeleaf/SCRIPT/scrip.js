
function getPics() {

    //just for this demo
    const imgs = document.getElementsByClassName('enlarge');
    const fullPage = document.getElementById('fullpage');


    for (let i = 0; i < imgs.length; i = i + 1) {
        
        imgs[i].addEventListener('click', function () {
            fullPage.style.backgroundImage = 'url(' + imgs[i].src + ')';
            fullPage.style.display = 'block';
            fullPage.scrollIntoView(true);
        });
    }
}
