package other.ajbckk.bdicfkbfkkfaa;

import com.rkhd.platform.sdk.ScriptTrigger;
import com.rkhd.platform.sdk.exception.ScriptBusinessException;
import com.rkhd.platform.sdk.param.ScriptTriggerParam;
import com.rkhd.platform.sdk.param.ScriptTriggerResult;

public class TriggerAndThrowsException implements ScriptTrigger{
	@Override
	public ScriptTriggerResult execute(ScriptTriggerParam param) throws ScriptBusinessException {
		throw new ScriptBusinessException("服务端脚本讓你的程序掛掉了！！！");
	}
}
