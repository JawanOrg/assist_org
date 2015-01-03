<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/js/highcharts/highcharts.js"></script>
<script type="text/javascript" src="/js/highcharts/exporting.js"></script>
<script type="text/javascript" src="/js/highcharts/highcharts-3d.js"></script>
<script type="text/javascript">
﻿$(function () {
    $('#container').highcharts({
        chart: {
            type: 'column',
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 15,
                viewDistance: 25,
                depth: 40
            },
            marginTop: 80,
            marginRight: 40
        },

        title: {
            text: '各单位施工情况总览'
        },

        xAxis: {
            categories: ['电信', '煤气', '自来水', '移动', '联通']
        },

        yAxis: {
            allowDecimals: false,
            min: 0,
            title: {
                text: '施工点数量'
            }
        },

        tooltip: {
            headerFormat: '<b>{point.key}</b><br>',
            pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
        },

        plotOptions: {
            column: {
                stacking: 'normal',
                depth: 40
            }
        },

        series: [{
            name: '计划中',
            data: [5, 3, 4, 7, 2],
            stack: 'female'
        }, {
            name: '施工中',
            data: [3, 4, 4, 2, 5],
            stack: 'male'
        }, {
            name: '已完工',
            data: [2, 5, 6, 2, 1],
            stack: 'female'
        }]
    });
});				
</script>
</head>
<body>
	<div id="container"></div>
</body>
</html>