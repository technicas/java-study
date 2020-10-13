// 设置画布

const canvas = document.querySelector('canvas');
//获取一个画画环境
const ctx = canvas.getContext('2d');

const width = canvas.width = window.innerWidth;
const height = canvas.height = window.innerHeight;

// 生成随机数的函数

function random(min,max) {
    const num = Math.floor(Math.random() * (max - min)) + min;
    return num;
}

function randomColor() {
    return 'rgb(' +
        random(0, 255) + ', ' +
        random(0, 255) + ', ' +
        random(0, 255) + ')';

}

/**
 * 小球模型
 * @param x x 和 y 坐标 —— 小球在屏幕上最开始时候的坐标。坐标的范围从 0 （左上角）到浏览器视口的宽和高（右下角）。
 * @param y x 和 y 坐标 —— 小球在屏幕上最开始时候的坐标。
 * @param velX 水平和竖直速度（velX 和 velY）—— 我们会给每个小球一个水平和竖直速度。实际上，当我们让这些球开始运动时候，每过一帧都会给小球的 x 和 y 坐标加一次这些值。
 * @param velY 水平和竖直速度（velX 和 velY）—— 我们会给每个小球一个水平和竖直速度。
 * @param color 每一个小球会有自己的颜色。
 * @param size 每一个小球会有自己的大小 — 也就是小球的半径，以像素为单位。
 * @constructor
 */
function Ball(x, y, velX, velY, color, size) {
    this.x = x;
    this.y = y;
    this.velX = velX;
    this.velY = velY;
    this.color = color;
    this.size = size;
}

/**
 * 画小球
 */
Ball.prototype.draw = function() {
    ctx.beginPath();
    ctx.fillStyle = this.color;
    ctx.arc(this.x, this.y, this.size, 0, 2 * Math.PI);
    ctx.fill();
}

Ball.prototype.update = function() {
    if ((this.x + this.size) >= width) {
        this.velX = -(this.velX);
    }

    if ((this.x - this.size) <= 0) {
        this.velX = -(this.velX);
    }

    if ((this.y + this.size) >= height) {
        this.velY = -(this.velY);
    }

    if ((this.x - this.size) <= 0) {
        this.velY = -(this.velY);
    }

    this.x += this.velX;
    this.y += this.velY;
}
//碰撞检测
Ball.prototype.collisionDetect = function () {
    for (let j = 0; j < balls.length; j++) {
        if (this !== balls[j]) {
            const dx = this.x - balls[j].x;
            const dy = this.y - balls[j].y;
            const distance = Math.sqrt(dx * dx +dy *dy);

            if (distance < this.size + balls[j].size) {
                balls[j].color = this.color = randomColor();
            }
        }
    }
}

//搞一堆小球出来
let balls = [];
while (balls.length < 25) {
    let size = random(10, 20);
    let ball = new Ball(
        random(0 + size, width - size),
        random(0 +size, height - size),
        random(-7, 7),
        random(-7, 7),
        randomColor(),
        size
    );
    balls.push(ball);
}

function loop() {
    ctx.fillStyle = 'rgba(0, 0, 0, 0.25)';
    ctx.fillRect(0, 0, width, height);

    for (let i = 0; i < balls.length; i++) {
        balls[i].draw();
        balls[i].update();
        balls[i].collisionDetect();
    }

    requestAnimationFrame(loop);
}

loop();

