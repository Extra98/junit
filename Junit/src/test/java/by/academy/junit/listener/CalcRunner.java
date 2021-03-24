package by.academy.junit.listener;

import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CalcRunner extends BlockJUnit4ClassRunner {
    private CalcListener ourListener;

    public CalcRunner(Class<RunListener> clz) throws InitializationError {
        super(clz);
        ourListener = new CalcListener();
    }

    @Override
    public void run(final RunNotifier notifier) {
        notifier.addListener(ourListener);
        super.run(notifier);
    }
}
