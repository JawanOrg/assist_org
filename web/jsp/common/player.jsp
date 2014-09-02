<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=GBK" language="java"%>
<html>
	<head>
		<title>声音警告</title>
	</head>
	<body>
		<object id="wmplayer" width="0" height="0"
			classid="CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6"
			type="application/x-oleobject" >
			<param name="SendPlayStateChangeEvents" value="true">
			<param name="autoStart" value="true">
			<param name="uiMode" value="invisible">
			<param name="playCount" value="1">
			<param name="volume" value="100">
		</object>
		<input type="button" name ="循环播放" onclick='setSoundPlayer ("start","receive.wav","loop");'/>
		<input type="button" name ="一次播放" onclick='setSoundPlayer ("start","receive.wav","once");'/>
		<input type="button" name ="停止" onclick='setSoundPlayer ("stop","","");'/>
		<input type="button" name ="静音" onclick='setSoundPlayer ("mute","","");'/>
	</body>

	<script type="text/javascript">
		var pWmplayerInterval;
		function setSoundPlayer(stat,wavFileName,loopMode) {
			//  控制播放器函数 ，参数如下
			//stat :    start--开始  stop --停止 mute-- 静音
			//loopMode : loop--循环; once --只播放一次
			//wavFileName :  声音文件名，全部制定放在 /web/sound/
			if(stat=="start") {
				wmplayer.settings.mute = false;
				wmplayer.url="/sound/"+ wavFileName;
				if(loopMode=="loop") {
					if(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);
					pWmplayerInterval=setInterval("wmplayer.controls.play()",1000);
				} else {
					wmplayer.controls.play();
				}
			} else if(stat=="stop") {
				if (wmplayer.controls.isavailable('stop')) {
					wmplayer.controls.stop();
					if(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);
				}
			} else if(stat=="mute") {
				wmplayer.settings.mute = !wmplayer.settings.mute;
			}
		}
		parent.openCheckLoop();
	</script>
</html>