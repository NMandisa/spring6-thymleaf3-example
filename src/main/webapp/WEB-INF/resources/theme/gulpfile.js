const gulp = require('gulp');
const concat = require('gulp-concat');
const uglify = require('gulp-uglify');
const pipeline = require('readable-stream').pipeline;
const { series, parallel } = require('gulp');
function defaultTask(cb) {
    // place code for your default task here
    cb();
}
// Concat and minify application specific JS files
gulp.task('build-js', function() {
    return gulp.src(['./js/app.js', './js/jquery/jquery-3.7.1.js', './js/bootstrap/bootstrap.js'])
        .pipe(concat('app.min.js'))
        .pipe(uglify())
        .pipe(gulp.dest('js/'));
});

exports.default = defaultTask