const gulp = require("gulp");
const task = gulp.task;
const del = require("del");
const less = require("gulp-less");
const path =require("path");
const ser = gulp.series;
const par = gulp.parallel;
const pug = require("gulp-pug");


gulp.task('clean', function () {
    return del(['build']);
});

gulp.task('less',function () {
    return gulp.src('front/less/*.less').pipe(less()).
    pipe(gulp.dest(path.resolve(__dirname, 'build',
        'public', 'blog')))
});
gulp.task('pug',function () {
    return gulp.src('web/ht/*.pug').pipe(pug()).
    pipe(gulp.dest(path.resolve(__dirname, 'build',
        'public', 'blog')))
});
// gulp.task('ser', gulp.series('clean','pug','less'));         //на уроке

// gulp.task('par',gulp.series('clean',gulp.parallel('pug','less')));       //ну уроке

gulp.task('ser', gulp.series('clean')); // a task
gulp.task('par',gulp.parallel('pug','less')); // b task
gulp.task('par',gulp.series('clean',gulp.parallel('pug','less'))); // c task

