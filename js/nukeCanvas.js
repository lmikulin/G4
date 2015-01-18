function draw(){
        //Connect this script to the canvas
        var canvas = document.getElementById('nukeCanvas');
        var context = canvas.getContext('2d');

        //Declear constants
        var defaultSize = 10;
        var defaultRange = 100;

        var size = (document.getElementById('size').value.length>0)?document.getElementById('size').value:defaultSize;
        var range = (document.getElementById('range').value.length>0)?document.getElementById('range').value:defaultRange;

        /* Examples
        var x = (document.getElementById('x').value.length>0)?document.getElementById('x').value:'200';

        // do cool things with the context
        context.font = '40pt Calibri';
        context.fillStyle = 'blue';
        context.fillText('Hello World!', 150, 100);

        //Drawing Line 1
        context.beginPath();
        context.moveTo(100, 150);
        context.lineTo(450, 50);
        context.lineWidth = 15;
        context.strokeStyle = '#ff0000';
        context.lineCap = 'round';
        context.stroke();

        //draw circle
        context.beginPath();
        context.arc(x, y, 40, 0, 2*Math.PI);
        context.stroke(); 
        
        //USe to clear stuff
        context.clearRect ( 0 , 0 , canvas.width, canvas.height );v
        */

        //draw circle - Test
        context.beginPath();
        context.arc(canvas.width / 2, canvas.height / 2, size, 0, 2*Math.PI);
        context.stroke();

        setTimeout(draw, 100);
}