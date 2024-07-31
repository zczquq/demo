package tech.powerjob.samples.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;
import tech.powerjob.worker.log.OmsLogger;

/**
 * @author 16339
 */
@Slf4j
@Component
public class StandaloneProcessorDemo implements BasicProcessor {
    @Override
    public ProcessResult process(TaskContext context) throws Exception {
        // powerjob在线日志，使用Logger打印的日志可以直接在powerjob控制台查看
        OmsLogger omsLogger = context.getOmsLogger();
        omsLogger.info("StandaloneProcessorDemo start process, context is {}.", context);
        System.out.println("jobParams is " + context.getJobParams());
        return new ProcessResult(true, "process successfully~");
    }
}
