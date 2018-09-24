package org.ccbcj.kits;

import org.ccbcj.core.NetworkParameters;
import org.ccbcj.store.BlockStore;
import org.ccbcj.store.BlockStoreException;
import org.ccbcj.store.LevelDBBlockStore;
import org.ccbcj.store.SPVBlockStore;

import java.io.File;

/**
 * Created by Eric on 2/23/2016.
 */
public class LevelDBWalletAppKit extends WalletAppKit {
    public LevelDBWalletAppKit(NetworkParameters params, File directory, String filePrefix) {
        super(params, directory, filePrefix);
    }

    /**
     * Override this to use a {@link BlockStore} that isn't the default of {@link SPVBlockStore}.
     */
    protected BlockStore provideBlockStore(File file) throws BlockStoreException {
        return new LevelDBBlockStore(context, file);
    }
}
